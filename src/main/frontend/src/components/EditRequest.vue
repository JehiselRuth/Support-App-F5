<script>

</script>

<template>
<div id="bigDiv">
    <h1>Edit request</h1>
    <div id="form">
        <div id="inputs">
        <input type="text" id="name" placeholder="Name">
        <input type="text" id="date" placeholder="Date">
        <input type="text" id="event" placeholder="Event">
        <input type="text" id="descriptión" placeholder="Descriptión">
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
    width: 50vw;
    height: 90vh;
    display: flex;
    flex-direction: column;
    align-items: center; 
    border-radius: 5%;

 h1{
    color: #262528;
    font-size: 5vw;
    font-family: Title;

}   

#form{
    background-color: #fff;
    width: 35vw;
    height: 60vh;
    border-radius: 5%;


#inputs{
    align-content: center;
    justify-content: center;

 #name{
    height: 3vw; 
    width: 30vw;
    background-color: #A08AEE;
    border-radius: 50px;
    justify-content: center;
    padding: 0em 0em 0em 1em;
    border: none;
    margin-top: 2em;
    
 }
 #date{
    height: 3vw; 
    width: 30vw;
    background-color: #A08AEE;
    border-radius: 50px;
    justify-content: center;
    padding: 0em 0em 0em 1em;
    border: none;
    margin-top: 2em;
 }
 #event{
    height: 3vw; 
    width: 30vw;
    background-color: #A08AEE;
    border-radius: 50px;
    justify-content: center;
    padding: 0em 0em 0em 1em;
    border: none;
    margin-top: 2em;
 }
 #descriptión{
    height: 5vw; 
    width: 30vw;
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

#cancel{
    border-radius: 10vw;
    background-color: #A08AEE;
    width: 5vw;
    height: 3vw;
    margin-bottom: 0.5vh;
    font-size: 1vw; 
}
#validate{
    border-radius: 10vw;
    background-color: #55A06F;
    width: 5vw;
    height: 3vw;
    margin-bottom: 0.5vh;
    font-size: 1vw; 
}

}

</style>