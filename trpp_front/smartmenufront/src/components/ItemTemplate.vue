<template>
  <div class="item_template">
    <div
      style="
        display: flex;
        flex-direction: row;
        background: #36363e;
        border-radius: 20px;
        width: 80%;
        padding: 50px;
        justify-content: space-evenly;
      "
    >
      <div
        class="image_wrapper"
        style="max-height: 500px; height: fit-content; overflow: hidden; border-radius: 10px; border: 1px solid white;"
        v-for="image in $store.state.item.images"
        :key="image.id"
      >
        <img :src="require(`${image.path}`)" alt="" />
      </div>
      <div class="description_wrapper">
        <h1 style="color: white; text-align: center">
          {{ $store.state.item.description }}
        </h1>
        <h2 style="text-align: center; color: lightblue; font-weight: bold; font-size: 30px;">
          {{ $store.state.item.price }} ₽
        </h2>
        <p>
          {{ $store.state.item.about }}
        </p>
        <div class="buttons" style="margin-left: 35%">
          <button @click="addToCart($store.state.item)">Add to cart</button>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "ItemTemplate",
  props: ["dishId"],
  methods:{
    addToCart(Item){
      this.$store.commit("updateCart", Item);
      this.$toast.open({
          message: 'Item added to cart',
          type: 'success',
          position: 'top-right',
          duration: 1500,
      });
    }
  },
};
</script>

<style scoped>
img {
  width: 350px;

  height: auto;
}
button {
  padding: 10px 20px;
  border: none;
  background-color: #333;
  color: #fff;
  font-size: 16px;
  cursor: pointer;
}
button:hover {
  background-color: #666;
}
.description_wrapper {
  max-width: 400px;
  justify-content: space-evenly;
  color: white;
  display: flex;
  flex-direction: column;
}

.description_wrapper p {
  color: white;
  text-align: center;

  font-weight: bold;
}
.item_template {
  position: relative;
  justify-content: space-evenly;
  background: #212020;
  display: flex;
  width: 100%;
  padding: 20px;
  height: 100%;
}
</style>