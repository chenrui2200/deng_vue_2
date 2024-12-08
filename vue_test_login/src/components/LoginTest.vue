<template>
  <div>
    <h1>{{ msg }}</h1>
    用户名test12：<input v-model="username">
    <br/>
    密码：<input v-model="password">
    <br/>
    <input type='button' @click="login()" value="登录"/>
  </div>
</template>

<script>
import LoginTest from './LoginTest'
export default LoginTest
</script>
<style scoped>

</style>
