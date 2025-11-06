<script>
    import { text } from "svelte/internal";
    import Hijo from "./Hijo.svelte";

	export let name;

	let count = 0;
	function incrementar() {
		count += 1;
	}

	let nombre;
	function saludar() {
		alert(nombre ? nombre: "valor por omision");
	}

</script>

<main>
	<h1>Funciona? {name}!</h1>

	<h1>{count}</h1>
	<button on:click={incrementar}>Sumar</button>
	<Hijo texto="Guardar" color="green"> </Hijo>
	<Hijo texto="Borrar" color="red"> </Hijo>
	<input type="text" bind:value={nombre} placeholder="Escribe tu nombre"/>
	<button on:click={saludar}> Saludar </button>


</main>

<style>
	main {
		text-align: center;
		padding: 1em;
		max-width: 240px;
		margin: 0 auto;
	}

	h1 {
		color: #ff3e00;
		text-transform: uppercase;
		font-size: 4em;
		font-weight: 100;
	}

	@media (min-width: 640px) {
		main {
			max-width: none;
		}
	}
</style>