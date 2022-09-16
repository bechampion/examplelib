def hi(message,url){
    echo "comming from lib ${message}"
    try {
        def res = httpRequest(
            url: "${url}:80",
            timeout: 2,
        )
    } catch (Exception ex){
        println("There's been some error but we are carrying on:"+getMessage())
    }
    finally {
        println(res.status)

    }

}
