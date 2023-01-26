<script setup>
import { RouterLink, RouterView } from 'vue-router'
import HeaderForAll from './components/HeaderForAll.vue'
</script>

<template>
  <header>
    <div class="wrapper">
      <HeaderForAll class="headerGijon" msg="Gijón Events" />
    </div>
  </header>
    <div id="app-structure">
      <nav>
        <RouterLink to="/">Home</RouterLink>
        <RouterLink to="/request">Request list</RouterLink>
        <RouterLink to="/form">Form</RouterLink>
        <RouterLink to="/edit">Edit</RouterLink>
      </nav>

      <RouterView />
    </div>
</template>

<style lang="scss" scoped>
 
#app-structure{
  display: flex;
  flex-direction:row;
  flex-wrap: wrap;
}

//este es contenedor del nav
nav {
  width: 15vw;
  height: 10vh;
  margin-bottom: 4%;
  background-color: rgba(227, 217, 231);
  border-bottom: 1px solid;
  border-radius: 15px;
  border-color: #33206C;
  border-style: solid;
  border-width: 1px;
}

//menú del nav
nav a.router-link-exact-active {
  color: #ffffff;
  padding: 0.2em;
}

//hover botones nav
nav a.router-link-exact-active:hover {
  background-color: #55A06F;
}

//color y características de los botones
nav a {
  display: flex;
  justify-content: space-around;
  margin: 0.5em;
  border-radius: 14px;
  font-size: 1.2em;
  background-color: #A08AEE;
  border-color: #33206C;
  border-style: solid;
  border-width: 1px;
}


@media (min-width: 1440px) {

  nav  {
    margin-left: -54%;
  }
}

@media (min-width: 1024px) {
  nav  {
    margin-left: -34%;
    
  }
}

@media (min-width: 768px) {
  //Aquí nav terco
  nav {
    font-size: 1em;
    padding: 0.5rem 0;
    margin-top: 4rem;
    height: 26rem;

  }
}

@media (min-width: 768px) {
  //Aquí nav terco
  nav {
   margin-right: 4em;
  }
}



@media (max-width: 320px) 

 {
  header  {
  text-align: center;
  justify-content: center;
  align-items: center;  
 }
}

</style>
