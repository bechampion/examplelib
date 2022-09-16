def hi(message,url){
    echo "comming from lib ${message}"
    try {
        def res = httpRequest(
            url: "${url}",
            timeout: 2,
        )
    } catch (Exception ex){
        println("There's been some error but we are carrying on")
    }
    finally {
        println(res.status)

    }

}
