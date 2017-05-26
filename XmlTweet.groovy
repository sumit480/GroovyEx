username="sumitsonu480@gmail.com"
password="9807227621"
numTweets="10"

if(args&&args[0].toFloat()>0)
numTweets=args[0]

//use twitter API with cURL
output="curl -u $username:$password http://twitter.com/sumitrocky480/with_replies.xml?count=$numTweets".execute().text

tweets=new XmlSlurper().parseText(output)
tweets.status.each{tweet->
println"${tweet.user.name}:${tweet.text}"
}