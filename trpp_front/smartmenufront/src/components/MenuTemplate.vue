<template>
  <div class="menu">
    <div class="logo"></div>
    <div class="menu__header">
      <h2 class="menu__title">Menu</h2>
    </div>
    <div class="menu__items">
      <a @click="sendMessage($event.target.innerHTML)" href="#">Drinks</a>
      <a @click="sendMessage($event.target.innerHTML)" href="#">Soups</a>
      <a @click="sendMessage($event.target.innerHTML)" href="#">Meat</a>
      <a @click="sendMessage($event.target.innerHTML)" href="#">Seafood</a>
      <a @click="sendMessage($event.target.innerHTML)" href="#">BBQ Beaf</a>
      <a @click="sendMessage($event.target.innerHTML)" href="#">Desert</a>
    </div>
  </div>
</template>

<script>
export default {
  methods: {
    sendMessage(item) {
      this.$emit("send-message", item);
      console.log(item + "in menu");
    },
  }
};
</script>
  
  <style scaped>
/* Стили для меню */
.menu {
  width: 250px;
  background-color: #fff;
  box-shadow: 0px 2px 5px rgba(0, 0, 0, 0.1);
  padding: 20px;
  height: 100vh;
  background: #323131;
  border-top-right-radius: 20px;
  border-bottom-right-radius: 20px;
  box-shadow: 2px 2px 10px #212121;
  position: fixed;
}

.menu__header {
  position: relative;
  margin-top: 25px;
}

.menu__title {
  position: relative;
  font-size: 24px;
  font-weight: bold;
  margin: 0;
  font-size: 32px;
  color: white;
}

.menu__items {
  position: relative;
  padding: 0 0 0 40px;
  margin-top: 63px;
  display: flex;
  flex-direction: column;
}

.menu__items a {
  width: 100px;
  text-align: center;
  margin-top: 25px;
  font-size: 20px;
  color: white;
  transition: all 0.3s ease;
  position: relative;
}

.menu__items a:hover {
  /* color: rgb(200, 38, 38); */
  color: #4caf50;
  text-decoration: none;
}

.menu__items a::before {
  content: "";
  position: absolute;
  width: 100%;
  height: 2px;
  bottom: -5px;
  left: 0;
  background-color: white;
  visibility: hidden;
  transform: scaleX(0);
  transition: all 0.3s ease-in-out 0s;
}

.menu__items a:hover::before {
  content: "";
  position: absolute;
  width: 100%;
  height: 2px;
  bottom: -5px;
  left: 0;
  background-color: white;
  visibility: visible;
  transform: scaleX(1);
  transition: all 0.3s ease-in-out 0s;
}

.logo {
  position: relative;
  background: #d9d9d9;
  width: 54px;
  height: 53px;
}
</style>
  