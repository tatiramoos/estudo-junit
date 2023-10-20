
![Logo](https://dev-to-uploads.s3.amazonaws.com/uploads/articles/th5xamgrr6se0x5ro4g6.png)


# Testes

Repositório para estudos de teste unitários e de integração.


## Links Importantes

- [Documentação JUnit 5](https://junit.org/junit5/docs/current/user-guide/)


## 🚀 Sobre mim
Eu sou uma pessoa desenvolvedora full-stack...


## Instalação

Assertivas mais comuns usadas em projetos:


```bash
  @Test
  public void assertivas() {

  Assertions.assertEquals("Casa", "Casa");
  Assertions.assertNotEquals("Casa", "casa");
  Assertions.assertTrue("casa".equalsIgnoreCase("CASA"));
  Assertions.assertTrue("Casa".endsWith("sa"));
  Assertions.assertTrue("Casa".startsWith("Ca"));
  
  List<String> s1 = new ArrayList<>();
  List<String> s2 = new ArrayList<>();
  List<String> s3 = null;

  Assertions.assertEquals(s1, s2);
  Assertions.assertSame(s1, s1);
  Assertions.assertNotEquals(s1, s3);
  Assertions.assertNull(s3);
  Assertions.assertNotNull(s1);
  Assertions.fail("Falhou pelo motivo A");
  }
```
    