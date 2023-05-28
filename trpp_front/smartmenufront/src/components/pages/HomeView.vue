<template>
    <div class="start">
      <header-vue @send-message="receiveMessage"></header-vue>
      <div class="flex-box">
        <header-template @header-message="dataFromHeader"></header-template>
        <main-template :message="message"></main-template>
      </div>
    </div>
  </template>
  
  <script>
import HeaderVue from '../MenuTemplate.vue';
import HeaderTemplate from '../HeaderTemplate.vue';
import MainTemplate from '../MainTemplate.vue';
  
  export default {  
    components: {HeaderVue, HeaderTemplate, MainTemplate },
    name: "HomeView",
    data(){
      return{
        message:'Drinks',
        filteredName: "",
      };
    },
    methods:{
      receiveMessage(data) {
        this.message = data;
      },
      dataFromHeader(data){
        this.filteredName = data;
      }
    }
  };
  </script>
  
  <style scoped>
  .start{
    display: flex;
    background: #36363E;
    /* flex-wrap: wrap;
    flex-direction: column; */
  }
  .flex-box{
    width: 100%;
    display: flex;
    flex-direction: column;
  }
  </style>
  