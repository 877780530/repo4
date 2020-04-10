var vue = new Vue({
    el:"#app",
    data:{
        user:{id:"",username:"",password:"",age:"",sex:"",email:""},
        userList:[]
    },
    methods:{
        findAll:function () {
            var _this = this;
            axios.get("/user/findAll.do").then(function (response) {
                _this.userList = response.data;
                console.log(_this.userList);
            }).catch(function (err) {
                console.log(err);
            });
        },
        findById:function (userid) {
            var _this = this;
            axios.get("/user/findById.do",{
                params:{
                    id:userid
                }
            }).then(function (response) {
                _this.user = response.data;
                $('#myModal').modal("show");
            }).catch(function (err) {
            })
        },
        update:function (user) {
            var _this = this;
            axios.post("/user/findAll.do",this.user).then(function (response) {
                _this.findAll();
            }).catch(function (err) {
            });
        }
    },
    create:function () {
        this.findAll();
    }
});




