def greetings(message,url) {
    println("ret")
   return hi(message,url)
}

def hi(message,url) {
    def res = {status: 000}
    try {
        res = httpRequest(
            url: "${url}",
            timeout: 2,
        )
    } catch (Exception ex){
        println("There's been an exception of type"+ex.toString()+"\nBut we're carrying on anyways")
    }
    return res.status

}
