package com.gfg.session18jbdl30majorproject.WalletService;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gfg.session18jbdl30majorproject.TransactionService.models.TransactionCreatedResponse;
import com.gfg.session18jbdl30majorproject.WalletService.Entity.Wallet;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.kafka.core.KafkaTemplate;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;

@SpringBootTest
class WalletManagerImplTest {

    @Autowired
    private WalletManager walletManager;
    @MockBean
    private WalletRepository walletRepository;
    @MockBean
    private KafkaTemplate<String,String> kafkaTemplate;

    ObjectMapper objectMapper = new ObjectMapper();

    @BeforeEach
    void setUp() {
    }

    @SneakyThrows
    @Test
    void updateWallet1() {
        Wallet from = Wallet.builder().username("xyz").balance(1000f).id(1l).build();
        Wallet to = Wallet.builder().username("abc").balance(1000f).id(2l).build();
        TransactionCreatedResponse transactionCreatedResponse = TransactionCreatedResponse
                .builder().transactionId("tx1").amount(100f).fromUser("xyz").toUser("abc").build();

        Mockito.when(walletRepository.findByUsername("xyz")).thenReturn(Optional.of(from));
        Mockito.when(walletRepository.findByUsername("abc")).thenReturn(Optional.of(to));
        Mockito.when(walletRepository.save(any())).thenReturn(null);
        Mockito.when(kafkaTemplate.send(any(),any())).thenReturn(null);
        walletManager.updateWallet(objectMapper.writeValueAsString(transactionCreatedResponse));
        Assertions.assertEquals(from.getBalance(),900);
        Assertions.assertEquals(to.getBalance(),1100);
    }


    @SneakyThrows
    @Test
    void updateWallet2() {
        Wallet from = Wallet.builder().username("xyz").balance(10f).id(1l).build();
        Wallet to = Wallet.builder().username("abc").balance(1000f).id(2l).build();
        TransactionCreatedResponse transactionCreatedResponse = TransactionCreatedResponse
                .builder().transactionId("tx1").amount(100f).fromUser("xyz").toUser("abc").build();

        Mockito.when(walletRepository.findByUsername("xyz")).thenReturn(Optional.of(from));
        Mockito.when(walletRepository.findByUsername("abc")).thenReturn(Optional.of(to));
        Mockito.when(walletRepository.save(any())).thenReturn(null);
        Mockito.when(kafkaTemplate.send(any(),any())).thenReturn(null);
        walletManager.updateWallet(objectMapper.writeValueAsString(transactionCreatedResponse));
        Assertions.assertEquals(from.getBalance(),10f);
        Assertions.assertEquals(to.getBalance(),1000f);
    }


}