def hi(message,url){
    echo "comming from lib ${message}"
    try {
        httpRequest(
            url: "${url}",
        )
    } catch (Exception ex){
        println(ex)
    }

}
