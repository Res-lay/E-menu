<template>
 <div v-if="showModal" class="modal">
      <div class="modal-content">
        <h2 style="text-align: center;">Order confirmation</h2>
        <form @submit.prevent="submitOrder">
          <label>Phone number:</label>
          <input type="text" v-model="phone" required>
          <label>Delivery address:</label>
          <input type="text" v-model="address" required>
          <label>Full Name:</label>
          <input type="text" v-model="fullName" required>
          <label>E-mail:</label>
          <input type="text" v-model="email" required>
          <button class="submit_form_button" type="submit" @click="submitOrder">Submit order</button>
          <button class="cancel_button" @click="showModal = false">Cancel</button>
        </form>
      </div>
    </div>
  <div class="result_template">
    <p>Result price: {{ getResultPrice() }} ₽</p>
    <button class="submit_button" @click="openModal">Buy</button>
  </div>
</template>

<script>
import axios from 'axios';

export default {

  name: "ResultTemplate",
  data() {
    return {
      showModal: false,
      phone: '',
      address: '',
      fullName: '',
      email: '',
    }
  },
  methods: {
    getResultPrice() {
      var price = 0;
      var temp = 0;
      for (let item in this.$store.state.cart) {
        temp = this.$store.state.cart[item]
        price += temp.price * Number(this.$store.state.counter[temp.description]);
      }
      return price;
    },
    openModal(){
        this.showModal = true;
    },
    submitOrder(){
        this.showModal = false;
        const API_URL = "http://localhost:8080";

        const apiClient = axios.create({
            baseURL: API_URL,
            withCredentials: false,
            headers: {
            Accept: 'application/json',
            'Content-Type': 'application/json',
            },
        });
        
        this.$toast.open({
          message: 'The order has been accepted for processing',
          type: 'success',
          position: 'top-right',
          duration: 2000,
      }),
        this.$store.state.cart = []
        apiClient.post("/submit-order", {
            name: this.fullName,
            address: this.email,  

        })
        .then(response => {
            console.log(response.data)
        })
        .catch(error =>{
            console.log(error.response.data)
        }),
        console.log("axios ready");
    }
  },
};
</script>

<style scoped>
.modal {
  background-color: rgba(11, 9, 9, 0.5);
  backdrop-filter: blur(5px);
  border-radius: 10px;
  box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.25);
  display: flex;
  align-items: center;
  justify-content: center;
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  z-index: 1000;
}

.modal-content {
  background-color: rgba(255, 255, 255, 0.15);
  border-radius: 10px;
  backdrop-filter: blur(15px);
  box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.25);
  padding: 2rem;
  width: 80%;
  max-width: 600px;
  color: white;
}


.modal input {
  margin-bottom: 10px;
  width: 100%;
  padding: 10px;
  border-radius: 5px;
  border: none;
}

.cancel_button {
  margin-top: 10px;
  padding: 10px;
  border-radius: 5px;
  border: none;
  color: #fff;
  background: red;
  margin-left: 378px;
  cursor: pointer;
}
.submit_form_button {
  margin-top: 10px;
  padding: 10px;
  border-radius: 5px;
  border: none;
  color: #fff;
  background: green;
  cursor: pointer;
}
.result_template {
  height: 80px;
  justify-content: space-between;
  background: #a28e8e;
  display: flex;
  position: relative;
  /* bottom: 0 */
}
.result_template p {
  font-size: 35px;
  padding: 20px;
  font-weight: bold;
}

.submit_button {
  height: 50px;
  transition: 0.5s;
  width: 100px;
  margin-top: 14px;
  margin-right: 14px;
  cursor: pointer;
  background: #4caf50;
  border: 1px solid white;
  font-size: 20px;
  font-weight: bold;
}
.submit_button:hover {
  border:1px solid black;
  color: white;
}
</style>