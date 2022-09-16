def hi(message,url){
    echo "comming from lib ${message}"
    try {
        def res = httpRequest(
            url: "${url}",
            timeout: 2,
        )
    } catch (Exception ex){
        println("There's been an exception of type"+ex.toString()+"\nBut we're carrying on anyways")
    }

}
