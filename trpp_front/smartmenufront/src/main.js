import { createApp } from 'vue'
import store from "./store.js"
import { createRouter, createWebHistory } from 'vue-router'
import App from './App.vue'
import Vuex from "vuex"
import VueToast from 'vue-toast-notification';
import 'vue-toast-notification/dist/theme-sugar.css';
import UserProfile from './components/pages/ProfilePage.vue'
import HomeView from './components/pages/HomeView.vue'
import ItemView from './components/pages/ItemView.vue'
import CartView from  './components/pages/CartPage.vue'


const router = createRouter({
  routes: [
        {
            path: '/',
            component: HomeView
        },
        {
          path: '/profile',
          component: UserProfile,
          name: "Profile"
        },
        {
          path: '/item',
          component: ItemView,
          name: "Item"
        },
        {
          path: '/cart',
          component: CartView,
          name: "Cart"
        },
    ],
    history: createWebHistory()
})



const app = createApp(App)
app.use(router)
app.use(Vuex)
app.use(store)
app.use(VueToast)
app.mount('#app')


