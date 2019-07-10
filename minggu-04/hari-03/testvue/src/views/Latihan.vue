<template>
    <div>
        <h1>Mozilla is cool</h1>
        <img src="http://mdn.github.io/beginner-html-site/images/firefox-icon.png" alt="my test image">
        <p>At Mozilla, we're a global community of</p>

        <p>working together dengan semua kekuatan yang ada dan para tetangga</p>
        <isidong/>
    </div>
</template>

<script>
import isidong from "@/components/Form.vue"

export default {
    components:{
        isidong
    } 
}
</script>


<style scoped>
    h1{
        font-size: 60px;
        text-align: center;
        margin: 0;
        padding: 20px 0;
        color: #00539F;
        text-shadow: 3px 3px 1px black;
    }

    img{
        display: block;
        margin: 0 auto;
    }

    p, li{
        font-size: 16px;
        line-height: 2;
        letter-spacing: 1px;
    }
</style>
