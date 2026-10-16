package com.springai.init.service;

import com.springai.init.dto.HerramientaDto;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class HerramientasServiceImpl implements HerramientasService {

    private ChatClient chatClient;

    @Value("${text.system}")
    private String system;
    @Value("${text.usuario}")
    private String user;

    public HerramientasServiceImpl(ChatClient chatClient) {
        super();
        this.chatClient = chatClient;
    }


    @Override
    public List<HerramientaDto> obtenerEntornos(String lenguaje, int total) {
        var systemTemplate = new PromptTemplate(system);
        var userTemplate = new PromptTemplate(user);

        var prompt = new Prompt(systemTemplate.createMessage(Map.of("lenguaje", lenguaje)),
                userTemplate.createMessage(Map.of("total", total)));

        return List.of(chatClient.prompt(prompt).call().entity(HerramientaDto[].class));
    }
}
