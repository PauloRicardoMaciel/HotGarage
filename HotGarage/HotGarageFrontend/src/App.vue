<script setup lang="ts">
import NavBar from './components/NavBar.vue'
import Carousel from './components/Carousel.vue'
import GrupoCard from './components/GrupoCard.vue';
import Teste from './components/Teste.vue';
</script>

<template>
  <NavBar />

  <main>
    <div>
     <Carousel />
    </div>
    <GrupoCard />

    <Teste /> 
    
    <GrupoCard />
    
    <GrupoCard />
    
    <GrupoCard />
    
    <GrupoCard />
  </main>
</template>
