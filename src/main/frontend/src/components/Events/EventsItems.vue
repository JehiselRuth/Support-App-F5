<template>
    <div class="wrapper">
      <div class="rollingStSection">
        <div class="imgEvent">
          <img class="imgRollingStones" src="../../assets/imgRollingStones.png" alt="imgRollingStones"/> 
        <h3> Concierto Rolling Stones </h3>
        </div>
      </div>
      <div class="sportSection">
        <div class="imgEvent">
          <img class="imgSporting" src="../../assets/imgPartidoSporting.png" alt="imgRollingStones"/> 
        <h3> Sporting - Arsenal Champions League</h3>
        </div>
      </div>
      <div class="openAtpSection">
        <div class="imgEvent">
          <img class="imgOpenAtp" src="../../assets/imgOpenAtp.png" alt="imgRollingStones"/> 
          <h3> Gijón Open Atp-250</h3>
        </div>
      </div>  
      <div class="bowlSection">
        <div class="imgEvent">
          <img class="imgBowl" src="../../assets/imgTorneoCelta.png" alt="imgRollingStones"/> 
          <h3>Torneo de Bolo Celta Villa de Gijón</h3>
        </div>
      </div>
    </div>  
  </template>
  
  <style lang="scss" scoped>

  .rollingStSection 
  {
  align-items: center ;
  display: block;
  justify-content: center;
  align-items: center;
  }
  .sportSection 
  {
  align-items: center ;
  display: block;
  justify-content: center;
  align-items: center;
  }
  .openAtpSection 
  {
  align-items: center ;
  display: block;
  justify-content: center;
  align-items: center;
  }
  .bowlSection 
  {
  align-items: center ;
  display: block;
  justify-content: center;
  align-items: center;
  }

  //Contenedor de eventos
  .wrapper {
    display: grid;
    grid-template-columns: repeat(2, 1fr);
    gap: 1em;
    grid-auto-rows: minmax(13em, 7em);
    background-color: rgba(227, 217, 231, 0.6);
    padding: 1em;
    border-radius: 2em;
    margin-left: 1em;
  }
  .imgEvent {
    max-width: 17em;
    max-height: 7em;
    align-items: center;
    justify-content: center;
    border-radius: 2em;
    text-align: center;
    padding: 1em;
  }
  
.imgRollingStones  {
    min-width: 6em;
    max-width: 95%;
  }

  .imgSporting  {
    min-width: 6em;
    max-width: 95%;
  }

  .imgOpenAtp  {
    min-width: 6em;
    max-width: 95%;
  }
   .imgBowl  {
    min-width: 6em;
    max-width: 95%;
  }

  //Titulos de los eventos
  h3 {
    font-size: 90%;
    font-weight: 500;
    color: #33206c;
  }
  
  @media (min-width: 1024px) {
    .item {
      margin-top: 0;
    }
   }

   @media (max-width: 320px) {
    .wrapper {
      display: grid;
      grid-template-columns: 1fr;
      width: 100%;
      margin-left: -1em;
    }
    
   }


  </style>
  