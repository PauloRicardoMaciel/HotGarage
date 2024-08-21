<script setup lang="ts">
import NavBar from './components/NavBar.vue'
import Carousel from './components/Carousel.vue'
import GrupoCard from './components/GrupoCard.vue';
import CarrosselItens from './components/CarrosselItens.vue';
</script>

<template>
  <NavBar />

  <main>
    <div>
     <Carousel />
    </div>
    <CarrosselItens id="1"/> 

    <CarrosselItens id="2" /> 
    
    <CarrosselItens  id="3"/> 
    
    <CarrosselItens  id="4"/> 
    
    <CarrosselItens  id="5"/> 
    
    <CarrosselItens  id="6"/> 
  </main>
</template>
