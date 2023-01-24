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
  margin-bottom: 7%;
}
//Texto inicial de la pagina
h3 {
  font-size: 1.6rem;
}
.headerGijonEvents h3 {
  align-items: center;
  text-align: center;
  justify-content: center;
  display: flex;
  color: #ece0f0;
  
}

@media (min-width: 1024px) {
  .headerGijonEvents h1  {
    margin-top: 6%;
  }
  .headerGijonEvents h3 {
    text-align: center;
    color: #ede0f2;
  }
}
@media (max-width: 320px) {
  header  {
margin-left: 8%;
 
 
}

}

</style>
