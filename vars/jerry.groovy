def hi(message,url){
    echo "comming from lib ${message}"
    try {
        httpRequest(
            url: "${url}:81",
            timeout: 2,
        )
    } catch (Exception ex){
        println(ex.getMessage())
    }

}
