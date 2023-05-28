<template>
  <div class="item_view">
    <new-header-template></new-header-template>
    <item-template-vue></item-template-vue>
  </div>
</template>

<script>

import ItemTemplateVue from '../ItemTemplate.vue'
import NewHeaderTemplate from '../NewHeaderTemplate.vue'
export default {
  components: {NewHeaderTemplate, ItemTemplateVue },
  
}
</script>

<style scoped>
  .item_view{
    display: flex;
    height: 100vh;
    flex-direction: column;
    background: #36363E;
  }
</style>