<script>
</script>

<template>
<div id="bigDiv">
 <h1>Request list</h1>
 <div id="table">
  <table class="Request">
    <tr>
        <th>Event</th>
        <th>Name</th>
        <th>Date</th>
    </tr>
    <tr>
        <td>Concierto Rolling Stones</td>
        <td>Guillermo</td>
        <td>12/06/23</td>
    </tr>
    <tr>
        <td>Champions Sporting-Arsenal</td>
        <td>Diego</td>
        <td>01/04/23</td>
    </tr>
    <tr>
        <td>Gijón Open ATP-250</td>
        <td>Vitoria</td>
        <td>01/09/23</td>
    </tr>
    <tr>
        <td>Torneo Bolo Celta</td>
        <td>Jehisel</td>
        <td>28/12/23</td>
    </tr>

  </table>
  </div>
</div>
</template>

<style lang="scss" scoped>
@font-face{
    font-family: Title;
    src:url(../assets/Expletus_Sans.zip)
}

#bigDiv{
    background-color: #E3D9E7;
    border-radius: 5%;
    width: 50vw;
    height: 90vh;
    display: flex;
    flex-direction: column;
    justify-content: space-around;
    align-items: center;
    
h1{
    color: #262528;
    font-size: 5vw;
    font-family: Title;

}   

#table{
    background-color: #fff;
    width: 35vw;
    height: 60vh;
    border-radius: 5%;
    display: flex;
    justify-content: center;
    border-color: #000;
    flex-direction: column;


th{
    font-family: Title;
    color: #fff;
    font-size: 1.5vw;
    background-color: #A08AEE;

}
td{
    color: #262528;
}
}
}

</style>