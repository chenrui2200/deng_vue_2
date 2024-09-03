const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  publicPath: process.env.VUE_APP_PUBLIC_PATH,
  productionSourceMap: false,
  lintOnSave: true,
  runtimeCompiler: true,

  devServer: {
    port: 9200,
    proxy: {
      "/api": {
        target: "http://127.0.0.1:8080",
        ws: false,
        changeOrigin: true,
        pathRewrite: (path) => path.replace(/^\/api/, "")
      }
    }
  }
})
