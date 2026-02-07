package br.com.dioformacaojava.javabasico.processoseletivo;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    private final static double baseValue = 2000;
    private final static ArrayList<String> selectCandidates = new ArrayList<>();
    private final static ArrayList<String> successCandidates = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("---- PROCESSO SELETIVO ----");
        System.out.println("Salário base: R$" + formatNumber(baseValue));

        selectCandidate();
    }

    public static void validateSalary(double desiredValue) {
        if (baseValue > desiredValue) {
            System.out.println("OBS: LIGAR PARA O CANDIDATO");
            System.out.println("----------------------------");
        }   else if (baseValue == desiredValue) {
            System.out.println("OBS: LIGAR PARA O CANDADATO COM CONTRA PROPOSTA");
            System.out.println("----------------------------");
        }   else {
            System.out.println("OBS: AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
            System.out.println("----------------------------");
        }
    }

    public static void selectCandidate() {
        String[] candidates = {"Felipe", "Marcia", "Julia", "Lucas", "Isabelle", "Paulo", "Monica", "Fabricio", "Pedro", "Fabio", "Daniela", "Augusto", "Guilherme", "Cristina"};
        int selectedCandidates = 0;
        int currentCandidate = 0;

        System.out.println("----------------------------");
        System.out.println("INICIO SELECAO: ");
        System.out.println("----------------------------");

        while (selectedCandidates < 5 && currentCandidate < candidates.length) {
            String candidate = candidates[currentCandidate];
            double desiredValue = generateDesiredValue();

            System.out.println("{ Candidato: " + candidate + ", Pretensão Salarial: R$" + formatNumber(desiredValue) + " }");
            validateSalary(desiredValue);
            if (baseValue >= desiredValue) {
                System.out.println("Candidato '" + candidate + "' selecionado para vaga!");
                System.out.println("----------------------------");
                selectCandidates.add(candidate);
                selectedCandidates++;
            }
            currentCandidate++;
        }

        showSelectCandidates();
    }

    public static void showSelectCandidates() {
        System.out.println("CANDIDATOS SELECIONADOS:");
        System.out.println("----------------------------");

        for (int i = 0; i < selectCandidates.size(); i++) {
            System.out.println((i + 1) + " - " + selectCandidates.get(i));
        }

        System.out.println("----------------------------");
        System.out.println("ENTRANDO EM CONTATO COM CANDIDATOS");
        System.out.println("----------------------------");

        for (String candidate : selectCandidates) {
            callCandidate(candidate);
        }

        success();
    }

    public static void callCandidate(String candidate) {
        int attempts = 1;
        boolean keepTry = true;
        boolean answer = false;

        do {
            answer = meet();
            keepTry = !answer;

            if (keepTry) {
                attempts++;
            }

        }   while (keepTry && attempts < 3);

        if (answer) {
            System.out.println("Contato realizado com sucesso com " + candidate + " na " + attempts + " tentativa.");
            successCandidates.add(candidate);
        }   else {
            System.out.println("Não conseguimos contato com " + candidate + ". Número máximo de tentativas atingido: " + attempts);
        }
    }

    public static void success() {
        System.out.println("----------------------------");
        System.out.println("CANDIDATOS APROVADOS");
        System.out.println("----------------------------");

        for (int i = 0; i < successCandidates.size(); i++) {
            System.out.println((i + 1) + " - " + successCandidates.get(i));
        }
    }

    // Métodos auxiliares
    public static double generateDesiredValue() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    public static String formatNumber(double value) {
        return String.format("%.2f", value);
    }

    public static boolean meet() {
        return new Random().nextInt(3) == 1;
    }
}
