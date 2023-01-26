<script>

</script>

<template>
<div id="bigDiv">
    <h1>Edit request</h1>
    <div id="form">
        <div id="inputs">
        <input type="text" id="name" class="formText" placeholder="Name">
        <input type="text" id="date" class="formText" placeholder="Date">
        <input type="text" id="event" class="formText" placeholder="Event">
        <input type="text" id="descriptión" class="formText" placeholder="Descriptión">
        </div>
        <div id="buttons">
            <button id="cancel">cancel</button>
            <button id="validate">Validate</button>
        </div>
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
    width: 28em;
    height: 70%;
    justify-content: space-around;
    align-items: center;
    justify-content: center;
    padding-bottom: 1.5em;
    margin-left: 2em;
    flex-wrap: wrap;
    justify-content: center;


 h1{
    color: #262528;
    font-size: 2em;
    text-align: center;   
    font-family: Title;

}   

#form{
    background-color: #fff;
    width: 80%;
    height: 20em;
    border-radius: 5%;
    display: flex;
    justify-content: center;
    flex-direction: row;
    
    flex-wrap: wrap;
    justify-content: center;


#inputs{
    display: flex;
    align-items: center;
    justify-content: center;
    flex-direction: column;

.formText{
    height: 3.2em; 
    width: 19em;
    background-color: #A08AEE;
    border-radius: 50px;
    justify-content: center;
    padding: 0em 0em 0em 1em;
    border: none;
    margin-top: 0.5em;  
 }

 #descriptión{
    height: 2em; 
    width: 19em;
    background-color: #A08AEE;
    border-radius: 50px;
    justify-content: center;
    padding: 0em 0em 0em 1em;
    border: none;
    margin-top: 2em;
 }
 ::placeholder{ 
        color: #262528;
 }
}
}
#buttons{
    justify-content: space-between;
    justify-content: space-around;
    bottom: 80px;
  

#cancel{
    border-radius: 10vw;
    background-color: #A08AEE;
    width: 85%;
    height: 28%;
    margin-bottom: 0.5vh;
    font-size: 1vw; 
    margin-left: 1vw;
}
#validate{
    border-radius: 10vw;
    background-color: #55A06F;
    width: 85%;
    height: 28%;
    margin-bottom: 0.5vh;
    font-size: 1vw; 
    margin-left: 1vw;
}
}
}

</style>