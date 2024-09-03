import axios from "axios";

export default {
    name: 'LoginTest',
    props: {

    },
    data() {
        return {
            msg: '',
            username: '',
            password: ''
        }
    },
    methods: {
        login() {
            let _this = this;
            axios.post(process.env.VUE_APP_BASE +
                `/apiLogin`,
                {
                    'username': this.username,
                    'password': this.password
                }).then(function (response) {
                if (response.data.code === '0') {
                    
                    _this.msg = response.data?.msg;
                }
            });
        }
    }
}