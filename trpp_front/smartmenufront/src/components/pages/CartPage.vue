<template>
  
  <div class="main">
    <new-header-template></new-header-template>
    <cart-items-template-vue></cart-items-template-vue>
   
  </div>
  <result-template-vue></result-template-vue>
</template>

<script>
import CartItemsTemplateVue from '../CartItemsTemplate.vue';
import NewHeaderTemplate from '../NewHeaderTemplate.vue';
import ResultTemplateVue from '../ResultTemplate.vue';
export default {
    components:{NewHeaderTemplate, CartItemsTemplateVue, ResultTemplateVue},
};
</script>

<style scoped>
.main {
  flex-direction: column;
  background: #36363e;
  display:flex;
  min-height: 100vh;
}
</style>