<template>
  
  <transition name="fade">
    <router-view />
  </transition>
</template>

<style>

* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}
ul {
  list-style: none;
}
a {
  text-decoration: none;
}
*::selection {
  background-color: transparent;
  color: inherit;
}
body {
  font-family: sans-serif;
  font-size: 16px;
}
img {
  max-width: 100%;
  height: auto;
}
.fade-enter-active,
.fade-leave-active {
  transition: opacity 0.5s ease;
}

.fade-enter-from,
.fade-leave-to {
  opacity: 0;
}
</style>
