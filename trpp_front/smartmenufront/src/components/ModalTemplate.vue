<template>
    <div>
      <div  class="modal">
        <div class="modal-content">
          <h2>Введите информацию о заказе:</h2>
          <form>
            <label for="phone">Номер телефона:</label>
            <input type="tel" id="phone" v-model="phone" required>
            <label for="address">Адрес доставки:</label>
            <input type="text" id="address" v-model="address" required>
            <label for="name">ФИО:</label>
            <input type="text" id="name" v-model="name" required>
            <label for="card">Номер карты:</label>
            <input type="text" id="card" v-model="card" required>
            <button>Оплатить заказ</button>
          </form>
        </div>
      </div>
    </div>
  </template>
<script>
export default {
    name: "ModalTemplate",
  data() {
    return {
      showModal: false,
      phone: '',
      address: '',
      name: '',
      card: ''
    }
  },
  methods: {
  }
}
</script>
<style scoped>
.modal {
  position: fixed;
  z-index: 1;
  left: 0;
  top: 0;
  width: 100%;
  height: 100%;
  background-color: rgba(0,0,0,0.4);
  display: flex;
  justify-content: center;
  align-items: center;
}

.modal-content {
  background-color: white;
  padding: 20px;
  border-radius: 5px;
  max-width: 500px;
}

form {
  display: flex;
  flex-direction: column;
}

label {
  margin-bottom: 5px;
}

input {
  margin-bottom: 10px;
  padding: 5px;
  border-radius: 5px;
  border: 1px solid gray;
}

button {
  padding: 10px 20px;
  border-radius: 5px;
  background-color: #3f51b5;
  color: white;
  border: none;
  cursor: pointer;
}

button:hover {
  background-color: #283593;
}
</style>
  