<template>
    <form >
        <label> Email : </label>
        <input type="email" required v-model="email">

          <label> Password : </label>
        <input type="password" required v-model="password">

        <label> Role: </label>
        <select v-model="role"> 
            <option value="developer"> Web Developer </option>
            <option value="designer">  Web designer </option>
        </select>
        

         <label> Skills: </label>
            <input type="text" v-model="tempSkill">
            

        <div class ="terms">
            <input type="checkbox"  v-model="terms" required>
            <label> Accept terms and conditions </label>
        </div>
               
        
    </form>
<!--

    <form action="signup.html" method="post" id="signup">
	<h1>Sign Up</h1>
	<div class="field">
		<label for="name">Name:</label>
		<input type="text" id="name" name="name" placeholder="Enter your fullname" />
		<small></small>
	</div>
	<div class="field">
		<label for="email">Email:</label>
		<input type="text" id="email" name="email" placeholder="Enter your email address" />
		<small></small>
	</div>
	<button type="submit">Subscribe</button>
</form>
-->

    <p> Email: {{ email }} </p>
    <p> Password: {{ password }} </p>
    <p> Role: {{role}} </p>
    <p> Terms Accepted : {{terms}} </p>

</template>

<script>
export default {
    data(){
    return{
      email: '',
      password:'',
      role:'designer',
      terms: false,
      tempSkill: '',
      skill: []
    }
  }

}
</script>

<style>
        form{
            max-width: 600px;
            margin: auto auto;
            background: wheat;
            text-align: left;
            padding: 40px;
            border-radius: 10px;
        }

        label{
            color: teal;
            display: inline-block;
            margin: 25px 0 15px;
            font-size: 0.6em;
            text-transform: uppercase;
            letter-spacing: 1px;
            font-weight: bold;
        }

        input, select{
            display: block;
            padding: 10px 6px;
            width: 100%;
            box-sizing: border-box;
            border: none;
            border-bottom: 1px snow;
            color: gray;
        }

        input[type="checkbox"]{
            display: inline-block;
            width: 16px;
            margin: 0 10px 0 0;
            position: relative;
            top:2px;
        }

</style>
