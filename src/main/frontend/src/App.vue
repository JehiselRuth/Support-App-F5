<script setup>
import { RouterLink, RouterView } from "vue-router";
import HeaderForAll from "./components/HeaderForAll.vue";
</script>

<template>
  <header>
    <div class="wrapper">
      <HeaderForAll class="headerGijon" msg="Gijón Events" />
    </div>
  </header>
  <div id="app-structure">
    <nav>
      <RouterLink to="/" class="button">Home</RouterLink>
      <RouterLink to="/request" class="button">Request list</RouterLink>
      <RouterLink to="/form" class="button">Form</RouterLink>
      <RouterLink to="/edit" class="button">Edit</RouterLink>
    </nav>

    <RouterView />
  </div>
</template>

<style lang="scss" scoped>
@font-face {
  font-family: Title;
  src: url(../assets/Expletus_Sans.zip);
}

#app-structure {
  display: flex;
  flex-direction: row;
  flex-wrap: wrap;
  justify-content: center;
  font-family: Title;

  nav {
    width: 15vh;
    height: 40vh;
    justify-content: flex-start;
    background-color: rgb(229, 231, 217);
    border-bottom: 1px solid;
    border-radius: 15px;
    border-color: #33206c;
    border-style: solid;
    border-width: 1px;
  }

  nav a.router-link-exact-active {
    color: #ffffff;
    padding: 0.2em;
  }

  nav a.router-link-exact-active:hover {
    background-color: #55a06f;
  }

  nav a {
    display: flex;
    justify-content: space-around;
    margin: 0.5em;
    border-radius: 14px;
    font-size: 1.2em;
    background-color: #a08aee;
    border-color: #33206c;
    border-style: solid;
    border-width: 1px;
  }

  @media (max-width: 768px) {
    nav {
      height: 10%;
      margin-bottom: 1em;
    }
  }
 }
  
</style>
