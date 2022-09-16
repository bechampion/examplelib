def hi(message,url){
    echo "comming from lib ${message}"
    try {
        httpRequest(
            url: "${url}",
            timeout: 2,
        )
    } catch (Exception ex){
        println(ex.message.get.Message())
    }

}
