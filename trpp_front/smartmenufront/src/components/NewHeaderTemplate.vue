<template>
  <header class="header">
    <p class="header_back" style="cursor: pointer; color:#3c8d3f; font-weight: bold; font-size: 20px;" @click="this.$router.go(-1)">Back</p>
    <h1 @click="this.$router.push('/')" style="cursor:pointer; margin-left: 90px; letter-spacing: 5px; text-shadow: 2px 2px 2px rgba(0,0,0,0.4);">SMARTMENU</h1>
    <div class="header__icons">
      <p class="header_icon" @click="this.$router.push('/cart')" style="font-weight: bold; font-size: 20px;" alt="">Cart</p>
      
    </div>
  </header>
</template>
<script>
export default {
  name: "NewHeaderTemplate",
  data() {
    return {
      search: "",
    };
  },
};
</script>
  
    
    <style scoped>
.header {
  display: flex;
  width: 100%;
  justify-content: space-between;
  align-items: center;
  background-color: transparent;
  padding: 20px;
  height: 79px;
  /* padding-left: 250px; */
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
  cursor: pointer;
}

.header_icon {
  display: flex;
  height: auto;
  align-items: center;
  margin-right: 20px;
  position: relative;
}
</style>