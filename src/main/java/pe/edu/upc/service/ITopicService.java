package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.model.Topic;

public interface ITopicService {
	public List<Topic> findAll();
	public Topic findById(int idTopic);
	public List<Topic> findByIdCategory(int idCategory);
	public Topic save(Topic topic);
}
