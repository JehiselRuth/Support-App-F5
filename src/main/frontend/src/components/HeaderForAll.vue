<script setup>
defineProps({
  msg: {
    type: String,
    required: true
  }
})
</script>

<template>
  <header>
  <div class="headerGijonEvents">
    <h1 class="msgHomeView">{{ msg }}</h1>
    <h3>
      Select here the event for your accreditation 
    </h3>
  </div>
</header>
</template>

<style lang="scss" scoped>

//Titulo de la pagina
h1 {
  display: flex;
  justify-content: center;
  align-items: center;
  font-weight:600;
  font-size: 3rem;
  margin-bottom: 5%;
}
//Texto inicial de la pagina
h3 {
  font-size: 1.6rem;
  text-align: center;
  color: #ffffff;
  justify-content: center;
  display: flex;
}

</style>
