<template>
  <div class="wrapper">
    <p v-if="$store.state.cart.length === 0" style="color:white; font-weight: bold; font-size: 30px;">Cart is empty</p>
    <div class="item_wrapper" v-for="item in $store.state.cart" :key="item.id">
      <div
        v-for="image in item.images"
        :key="image.id"
        style="
          height: 300px;
          border: 1px solid white;
          border-radius: 10px;
          overflow: hidden;
        "
      >
        <img
          :src="require(`${image.path}`)"
          alt=""
          @click="this.$router.push('/item'); refreshData(item)"
          style="width: 200px; height: auto; border-radius: 20px; cursor: pointer;"
        />
      </div>
      <div
        style="
          display: flex;
          flex-wrap: wrap;
          flex-direction: column;
          justify-content: space-evenly;
        "
      >
        <h3 style="color: whitesmoke; text-align: center; font-size: 20px; font-weight: bold;">{{ item.description }}</h3>
        <p style="color: whitesmoke; text-align: center; font-weight: bold; font-size: 25px;">{{ item.price }} ₽</p>
        
        <div style="display:flex; flex-direction: row;"> 
          <p style="color: whitesmoke; padding:5px; text-align: center; font-weight: bold; font-size: 25px;">QTY: {{ $store.state.counter[item.description] }}</p>
          <button class="q_button" @click="change_q(item, 'more')">+</button>
          <button class="q_button" @click="change_q(item, 'less')">-</button>
        </div>
        <button class="del_button" @click="deleteItem(item)">DELETE</button>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "CartItemsTemplate",
  methods: {
    deleteItem(Item) {
      this.$store.commit("deleteItem", Item);
    },
    refreshData(Item){
      this.$store.commit("updateItem", Item) 
    },
    change_q(item, option){
      if (option == "more"){
        this.$store.commit("increase", item);
      }
      else if (option == "less"){
        this.$store.commit("decrease", item);
      }
      
    }
  },
};
</script>

<style scoped>
.wrapper {
  display: flex;
  background: #212020;
  flex-direction: row;
  flex-wrap: wrap;
  padding: 20px;
  justify-content: space-evenly;
  height: 100%;
}
.item_wrapper {
  justify-content: space-around;
  padding: 10px;
  width: 30%;
  height: 320px;
  margin-top: 10px;
  border-radius: 20px;
  background: #36363e;
  display: flex;
}

.q_button{
  align-self: center;
  border: none;
  width: 30px;
  height: 30px;
  margin:5px 2px 5px 2px;
  background-color: #2b2a2a;
  color: #fff;
  border-radius: 100%;
  font-size: 16px;
  cursor: pointer;
  transition: 0.5s;
}
.item_wrapper .del_button {
  padding: 10px 20px;
  align-self: center;
  border: none;
  width: 100px;
  background-color: #2b2a2a;
  color: #fff;
  font-size: 16px;
  cursor: pointer;
  transition: 0.5s;
}

.item_wrapper button:hover {
  background-color: rgb(168, 160, 160);
  color: #2b2a2a;
  border: solid #2b2a2a 1px;
}


</style>