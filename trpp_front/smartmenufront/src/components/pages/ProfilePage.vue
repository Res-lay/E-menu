<template>
    <div class="profile">
      <h2>Профиль пользователя</h2>
      <div class="user-info">
        <!-- <img :src="user.avatar" alt="avatar" class="avatar" /> -->
        <div class="details">
          <h3>Tyler</h3>
          <p>email</p>
          <p>phone</p>
        </div>
      </div>
      <h3>История заказов</h3>
      <div class="order-history">
        <div class="order">
          <h4>дата заказа</h4>
          <p>время</p>
          <p>Итого: 1000</p>
        </div>
      </div>
    </div>
  </template>
  
  <script>
  export default {
    name:"UserProfile",

  };
  </script>
  
  <style scoped>
.profile {
  max-width: 800px;
  margin: 0 auto;
  
  padding: 20px;
}

.user-info {
  display: flex;
  align-items: center;
  margin-bottom: 20px;
}

.avatar {
  width: 80px;
  height: 80px;
  border-radius: 50%;
  object-fit: cover;
  margin-right: 20px;
}

.details {
  display: flex;
  flex-direction: column;
}

h2 {
  font-size: 32px;
  margin-bottom: 20px;
}

h3 {
  font-size: 24px;
  margin-bottom: 10px;
}

p {
  margin-bottom: 5px;
}

.order-history {
  display: flex;
  flex-direction: column;
}

.order {
  margin-bottom: 20px;
  padding: 20px;
  background-color: #f2f2f2;
  border-radius: 10px;
}

.order h4 {
  font-size: 20px;
  margin-bottom: 10px;
}

.order p {
  margin-bottom: 5px;
}

.order p:last-child {
  font-weight: bold;
}

  </style>
  