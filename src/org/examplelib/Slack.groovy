package org.examplelib
class Slack {                       
    String msg                      
    String channel
  def sendMessage() {
  	return this.msg
  }
}

def s =  new Slack()
s.msg="pepinos"
s.sendMessage()

