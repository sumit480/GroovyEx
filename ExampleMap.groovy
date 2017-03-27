class ExampleMaps{
	static void main(String[] args){
		def mp=["TopicName":"Hello World","TopicDescription":"Groovy"];
		
		println(mp.containsKey("TopicName"));
		
		println(mp.containsKey("Topic"));

		println(mp.get("TopicName"));
		
		println(mp.keySet());

		mp.put("TopicID","1");
		println(mp);

		println(mp.size());

		println(mp.values());
}
}