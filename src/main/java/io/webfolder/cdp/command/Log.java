/**
 * cdp4j Commercial License
 *
 * Copyright 2017, 2020 WebFolder OÜ
 *
 * Permission  is hereby  granted,  to "____" obtaining  a  copy of  this software  and
 * associated  documentation files  (the "Software"), to deal in  the Software  without
 * restriction, including without limitation  the rights  to use, copy, modify,  merge,
 * publish, distribute  and sublicense  of the Software,  and to permit persons to whom
 * the Software is furnished to do so, subject to the following conditions:
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR  IMPLIED,
 * INCLUDING  BUT NOT  LIMITED  TO THE  WARRANTIES  OF  MERCHANTABILITY, FITNESS  FOR A
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL  THE AUTHORS  OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF
 * CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE
 * OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package io.webfolder.cdp.command;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.type.log.ViolationSetting;
import java.util.List;

/**
 * Provides access to log entries
 */
@Domain("Log")
public interface Log {
    /**
     * Clears the log.
     */
    void clear();

    /**
     * Disables log domain, prevents further log entries from being reported to the client.
     */
    void disable();

    /**
     * Enables log domain, sends the entries collected so far to the client by means of the
     * <code>entryAdded</code> notification.
     */
    void enable();

    /**
     * start violation reporting.
     * 
     * @param config Configuration for violations.
     */
    void startViolationsReport(List<ViolationSetting> config);

    /**
     * Stop violation reporting.
     */
    void stopViolationsReport();
}
