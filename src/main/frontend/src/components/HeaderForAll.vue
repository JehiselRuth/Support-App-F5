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
      Select here your request 
    </h3>
  </div>
</header>
</template>

<style lang="scss" scoped>
@font-face{
    font-family: Title;
    src:url(../assets/Expletus_Sans.zip)
}

h1 {
  font-family: Title;
  display: flex;
  justify-content: center;
  align-items: center;
  font-weight:600;
  font-size: 6vw;
  line-height: 5vh;
}

h3 {
  font-family: Title;
  font-size: 3vw;
  text-align: center;
  color: #ffffff;
  justify-content: center;
  display: flex;
}


</style>
