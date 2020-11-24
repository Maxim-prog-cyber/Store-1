
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;
import org.telegram.telegrambots.exceptions.TelegramApiRequestException;

import java.util.ArrayList;

public class Bot extends TelegramLongPollingBot {
    public static void main(String[] args) {
        ApiContextInitializer.init();
        TelegramBotsApi botsApi = new TelegramBotsApi();
        try {
            botsApi.registerBot(new Bot());
        } catch (TelegramApiRequestException e) {
            e.printStackTrace();
        }
    }


    public void onUpdateReceived(Update update) {
        Message msg = update.getMessage();

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();

        KeyboardRow first = new KeyboardRow();
        KeyboardRow second = new KeyboardRow();
        ArrayList<KeyboardRow> keyboard = new ArrayList<KeyboardRow>();
        keyboard.add(first);
        keyboard.add(second);
        replyKeyboardMarkup.setKeyboard(keyboard);

//--------------------------------------------------------------------------------------------
        if (msg.getText().equals("/start")) {
            first.add("Магазин\uD83C\uDF1A");
            second.add("Найти товар\uD83D\uDD0D");
            second.add("\uD83D\uDC7EВыйти из меню\uD83D\uDC7E");

            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(msg.getChatId());
            sendMessage.setText("Добро пожаловать в лавку бесконечности.");
            sendMessage.setReplyMarkup(replyKeyboardMarkup);

            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }

            SendMessage sendMessage1 = new SendMessage();
            sendMessage1.setChatId(msg.getChatId());
            sendMessage1.setText("Команда /menu открывает меню.");

            try {
                execute(sendMessage1);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
//--------------------------------------------------------------------------------------------
        if (msg.getText().equals("Магазин\uD83C\uDF1A")) {
            first.add("Цветы\uD83C\uDF39");
            first.add("Корзинки\uD83D\uDCE6");
            second.add("Обертки\uD83D\uDDC2");
            second.add("Открытки\uD83E\uDD73");
            second.add("\uD83D\uDC7EВыйти в главное меню\uD83D\uDC7E");

            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(msg.getChatId());
            sendMessage.setReplyMarkup(replyKeyboardMarkup);
            sendMessage.setText("-");

            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
//--------------------------------------------------------------------------------------------
        if (msg.getText().equals("Найти товар\uD83D\uDD0D")) {
            first.add("\uD83D\uDC7EВыйти в главное меню\uD83D\uDC7E");
            second.clear();
            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(msg.getChatId());
            sendMessage.setText("Введи код товара: ");
            sendMessage.setReplyMarkup(replyKeyboardMarkup);

            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }

//--------------------------------------------------------------------------------------------
        if (msg.getText().equals("/menu")) {
            first.add("Магазин\uD83C\uDF1A");
            second.add("Найти товар\uD83D\uDD0D");
            second.add("\uD83D\uDC7EВыйти в главное меню\uD83D\uDC7E");

            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(msg.getChatId());
            sendMessage.setText("Добро пожаловать в лавку бесконечности.");
            sendMessage.setReplyMarkup(replyKeyboardMarkup);

            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }

        }
//--------------------------------------------------------------------------------------------
        if (msg.getText().equals("\uD83D\uDC7EВыйти в главное меню\uD83D\uDC7E")) {
            first.add("Магазин\uD83C\uDF1A");
            second.add("Найти товар\uD83D\uDD0D");
            second.add("\uD83D\uDC7EВыйти в главное меню\uD83D\uDC7E");

            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(msg.getChatId());
            sendMessage.setText("Добро пожаловать в лавку бесконечности.");
            sendMessage.setReplyMarkup(replyKeyboardMarkup);

            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }

        }
//--------------------------------------------------------------------------------------------



    }


    public String getBotUsername() {
        return "StoreOfInfinity_bot";
    }

    public String getBotToken() {
        return "1458747209:AAGcg2SOjqD4tDBBXUM6Nzu8yMRNTC0937k";
    }
}
