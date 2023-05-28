<template>
  <header class="header">
    
    <div class="header__icons">
      <h1 @click="this.$router.push('/')" style="cursor:pointer;  margin-right: 500px; letter-spacing: 5px; text-shadow: 2px 2px 2px rgba(0,0,0,0.4);">SMARTMENU</h1>
      <p class="header_icon" @click="this.$router.push('/cart')" alt="">Cart</p>
    </div>
  </header>
</template>
  <script>
export default {
  name: "HeaderTemplate",
  data() {
    return {
      search: "",
    };
  },
  methods: {
    sendMessage() {
      this.$emit("header-message", this.search);
      console.log(this.search);
    },
  },
};
</script>

  
  <style scoped>
.header {
  display: flex;
  width: 100%;
  justify-content: flex-end;
  align-items: center;
  background-color: transparent;
  padding: 20px;
  height: 79px;
  padding-left: 250px;
  position: relative;
  color: white;
  font-weight: bold;
}

.header__search-button:hover {
  background-color: #3c8d3f;
  color: black;
}

.header__icons {
  display: flex;
  justify-content: space-between;
}

.header_icon {
  display: flex;
  cursor: pointer;
  height: auto;
  align-items: center;
  margin-right: 20px;
  font-size: 20px;
  font-weight: bold;
  position: relative;
}
</style>
