def greetings(message,url) {
    println("ret")
    println(hi(message,url))
}

def hi(message,url) {
    try {
        def res = httpRequest(
            url: "${url}",
            timeout: 2,
        )
    } catch (Exception ex){
        println("There's been an exception of type"+ex.toString()+"\nBut we're carrying on anyways")
    }finally {
        return 000.toString()
    }
    return res.status

}
