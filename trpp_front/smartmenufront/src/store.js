import {createStore} from "vuex"


const store = createStore({
  state() {
    return{
      item: {},
      counter: {},
      cart:[],
    }
  },
  mutations:{
    updateItem(state, newItem){
      state.item = newItem;
    },
    updateCart(state, newItem){
      if (newItem.description in state.counter){
        state.counter[newItem.description] += 1;
        console.log(newItem.description)
      }
      else{
        state.cart.push(newItem);
        state.counter[newItem.description] = 1;
      }
    },
    deleteItem(state, Item){
      const index = state.cart.indexOf(Item);
      if (index > -1){
        state.cart.splice(index, 1);
      }
      delete state.counter[Item.description];
    },
    increase(state, Item){
      state.counter[Item.description] += 1;
    },
    decrease(state, Item){
      if (state.counter[Item.description] == 1){
        this.commit("deleteItem", Item);
      }
      else{
        state.counter[Item.description] -= 1;
      }
    },
  }
})


export default store;
