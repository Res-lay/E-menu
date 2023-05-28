<template>
  <div class="main">
    <div class="filter-select">
      <div class="filter-select__label">Filter by:</div>
      <div class="filter-select__wrapper">
        <select v-model="filter" class="filter-select__select">
          <option
            v-for="option in filterOptions"
            :value="option.value"
            :key="option.value"
          >
            {{ option.label }}
          </option>
        </select>
      </div>
    </div>  
    <div class="gallery_wrapper">
      <transition-group name="dishes-list">
        <div
          v-for="dish in sortedItems"
          :key="dish.id"
          class="item_card_wrapper"
        >
          <div class="card">
            <div
              class="image_wrapper"
              v-for="image in dish.images"
              :key="image.id"
            >
              <img
                v-if="image.previewImage"
                @click="this.$router.push('/item'); refreshData(dish)" 
                :src="require(`${image.path}`)"
                alt=""
                class="card_img"
              />
            </div>
            <div class="card_info">
              <h3>{{ dish.description }}</h3>
              <p>{{ dish.price }} ₽</p>
              <button @click="addToCart(dish)">Add to cart</button>
            </div>
          </div>
        </div>
      </transition-group>
    </div>
  </div>
</template>

<script>
import api from "@/api/api.js";


export default {
  props: {
    message: {
      type: String,
    },
  },
  name: "MainTemplate",
  data() {
    return {
      dishes: [],
      filter: "price",
      filterOptions: [
        { value: "price", label: "Price" },
        { value: "descriprion", label: "Rating" },
      ],
    };
  },
  mounted() {
    api.get(this.message).then((response) => {
      this.dishes = response.data;
    });
  },
  watch: {
    message: function () {
      api.get(this.message).then((response) => {
        console.log(this.message + " in watch");
        this.dishes = response.data;
      });
    },
  },
  computed: {
    sortedItems() {
      console.log(this.filter);
      return this.dishes.slice().sort((a, b) => {
        return a[this.filter] - b[this.filter];
      });
    },
  },
  methods:{
    refreshData(Item){
      this.$store.commit("updateItem", Item) 
    },
    addToCart(Item){
      this.$store.commit("updateCart", Item);
      this.$toast.open({
          message: 'Item added to cart',
          type: 'success',
          position: 'top-right',
          duration: 1500,
      });
    }
  }
};
</script>

<style scoped>
.dishes-list-move {
  transition: transform 0.8s ease;
}
.main {
  position: relative;
  background: #212020;
  height: 20px;
  display: flex;
  margin-top: 22px;
  height: 100%;
  border-top-left-radius: 20px;
  border-top-right-radius: 20px;
  border-bottom-left-radius: 20px;
  box-shadow: 2px 2px 10px #212121;
  margin-left: 250px;
  height: 100vh;
  overflow: hidden;
  flex-direction: row;
  padding: 0 30px 30px 0px;
  flex-wrap: wrap;
}

.item_card_wrapper {
  display: flex;
  flex-wrap: wrap;
}

.gallery_wrapper {
  position: relative;
  display: flex;
  flex-wrap: wrap;
}

.card {
  background: #212020;
  box-shadow: 2px 2px 10px #000000;
  margin-left: 55px;
  margin-top: 30px;
  width: 250px;
  height: 300px;
  border-radius: 20px;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  overflow: hidden;
  transition: transform 0.3s ease-in-out;
  box-shadow: 0px 2px 6px rgba(0, 0, 0, 0.1);
}

.card:hover {
  transform: scale(1.05);
}

img {
  max-width: 100%;
  cursor: pointer;
}

/* .card:hover .card_img {
  opacity: 0.8;
} */

.card .card_info {
  position: absolute;
  display: none;
  bottom: 0;
  left: 0;
  width: 100%;
  padding: 20px;
  box-sizing: border-box;
  background-color: rgba(255, 255, 255, 0.9);
  transition: transform 0.3s ease-in-out;
}

.card:hover .card_info {
  /* transform: translateY(0%); */
  display:block;
}

.card .card_info h3 {
  font-size: 20px;
  margin: 0;
  margin-bottom: 10px;
  color: #333;
}

.card .card_info p {
  font-size: 16px;
  margin: 0;
  margin-bottom: 20px;
  color: #666;
}

.card .card_info button {
  padding: 10px 20px;
  border: none;
  background-color: #333;
  color: #fff;
  font-size: 16px;
  cursor: pointer;
}

.card .card_info button:hover {
  background-color: #666;
}
.filter-select {
  display: flex;
  width: 100%;
  justify-content: end;
  height: 30px;
  align-items: center;
  margin: 10px;
  position: relative;
  font-weight: bold;
  color: white;
}

.filter-select__label {
  font-size: 1.2rem;
  margin-right: 1rem;
}

.filter-select__wrapper {
  position: relative;
}

.filter-select__select {
  appearance: none;
  padding: 0.5rem 2rem 0.5rem 1rem;
  border: 1px solid #ccc;
  border-radius: 0.25rem;
  font-size: 1rem;
  cursor: pointer;
}

.filter-select__select:focus {
  outline: none;
  border-color: #000000;
  box-shadow: 0 0 0 2px rgba(0, 123, 255, 0.25);
}

.filter-select__select::-ms-expand {
  display: none;
}

.filter-select__select-icon {
  position: absolute;
  top: 50%;
  right: 0.75rem;
  transform: translateY(-50%);
  pointer-events: none;
  width: 1.25rem;
  height: 1.25rem;
  fill: #aaa;
  transition: fill 0.2s ease-in-out;
}

.filter-select__select:hover .filter-select__select-icon {
  fill: #888;
}

.filter-select__select:focus ~ .filter-select__select-icon {
  fill: #536f8b;
}
</style>