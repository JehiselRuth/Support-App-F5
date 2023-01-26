<script setup>
import  EventsItems from '../components/Events/EventsItems.vue'


</script>

<template>
  <main>
    <EventsItems />
  </main>
</template>

<style lang="scss" scoped>

.EventsItems{
 display: flex;
 justify-content: center;
}

@media (min-width: 1024px) 

 {
  main  {
    margin-top: -30em;
  }
}

@media (max-width: 768px) 

 {
  main  {
    background-color: none;

  }
}


@media (min-width: 768px) 

 {
  main  {
  max-width: 30em;
  margin-top: -30em;
 }
}

@media (min-width: 461px) 

 {
  main  {
  margin-left: 3.1em;
  max-width: 30em;

 }
}
//arreglo 768
@media (max-width: 768px) 

{
 main  {
margin-left: 24%;
max-width: 25em;

}
}


</style>


