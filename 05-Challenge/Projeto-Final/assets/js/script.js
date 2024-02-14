const encryptionKeys = {
    'e': 'enter',
    'i': 'imes',
    'a': 'ai',
    'o': 'ober',
    'u': 'ufat'
};

function validateInput(inputText) {
    /* const regex = /^[a-zç,;.:?!\s]*$/; - aceita alguns caracteres especiais */
    const regex = /^[a-zç\s]*$/;
    return regex.test(inputText);
}

function encrypt() {
    const inputText = document.querySelector('.inputText').value;
    if (!validateInput(inputText)) {
        alert('Por favor, digite apenas letras minúsculas e sem acento.');
        return;
    }

    let encryptedText = '';

    for (let char of inputText) {
        if (encryptionKeys[char]) {
            encryptedText += encryptionKeys[char];
        } else {
            encryptedText += char;
        }
    }

    displayOutput(encryptedText);
}

function decrypt() {
    const inputText = document.querySelector('.inputText').value;
    if (!validateInput(inputText)) {
        alert('Por favor, digite apenas letras minúsculas e sem acento.');
        return;
    }

    let decryptedText = inputText;

    for (let key in encryptionKeys) {
        let re = new RegExp(encryptionKeys[key], 'g');
        decryptedText = decryptedText.replace(re, key);
    }

    displayOutput(decryptedText);
}

function displayOutput(outputText) {
    const outputSection = document.querySelector('.retorno');
    outputSection.innerHTML = ''; // Limpa a seção de saída

    const textarea = document.createElement('textarea');
    textarea.textContent = outputText;
    outputSection.appendChild(textarea);

    // Mostra o botão de cópia
    const copyButton = document.querySelector('.btn-copiar');
    copyButton.style.display = 'block';

    copyButton.onclick = function () {
        textarea.select();
        document.execCommand('copy');
    }
}
