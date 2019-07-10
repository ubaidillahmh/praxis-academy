<template>
    <div>
        <label for="">{{ isilur }}</label>
        <input type="text" placeholder="isi dong"/>
        <button @click="ganti()">Tekan</button>
    </div>
</template>

<script>
export default {
    data: () => ({
        isilur: "Nama"
    })
    ,

    methods: {
        ganti()
        {
            this.isilur = "Nama Aja"
        }
    }
}
</script>



