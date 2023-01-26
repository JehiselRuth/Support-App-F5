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

  .wrapper {
    display: grid;
    grid-template-columns: repeat(2, 1fr);
    gap: 1em;
    grid-auto-rows: minmax(13em, 7em);
    background-color: rgba(227, 217, 231);

    border-radius: 2em;
    margin-left: 1em;
  
  .rollingStSection 
  {
  align-items: center ;
  display: block;
  justify-content: center;
  align-items: center;
  padding-bottom: 3em;
  }
  .sportSection 
  {
  align-items: center ;
  display: block;
  justify-content: center;
  align-items: center;
  padding-bottom: 3em;
  }
  .openAtpSection 
  {
  align-items: center ;
  display: block;
  justify-content: center;
  align-items: center;
  padding-bottom: 3em;
  }
  .bowlSection 
  {
  align-items: center ;
  display: block;
  justify-content: center;
  align-items: center;
  padding-bottom: 3em;
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
    border-radius: 18px;
    
  }

  .imgSporting  {
    min-width: 6em;
    max-width: 95%;
    border-radius: 18px;
  }

  .imgOpenAtp  {
    min-width: 6em;
    max-width: 95%;
    border-radius: 18px;
  }
   .imgBowl  {
    min-width: 6em;
    max-width: 95%;
    border-radius: 18px;
  }

  h3 {
    font-size: 90%;
    font-weight: 500;
    color: #33206c;
    margin-bottom: 3em;
  }
}

@media (max-width: 425px)  {
 
 .wrapper  {
  display: flex;
  flex-direction:column;
  padding-bottom: 5em;
 }
}

  </style>
  