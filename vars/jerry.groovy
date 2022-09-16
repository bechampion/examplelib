def hi(message,url){
    echo "comming from lib ${message}"
    try {
        def res = httpRequest(
            url: "${url}:81",
            timeout: 2,
        )
    } catch (Exception ex){
        println(ex.getMessage())
    }
    finally {
        println(res.status)

    }

}
